public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Puffendui[] studyPuffendui = {
                new Puffendui("Zakaria", "Smith", 20, 18, 10, 15, 8),
                new Puffendui("Cedrik", "Diggory", 25, 23,10, 15, 8),
                new Puffendui("Zakharya", "Smith", 16, 19,6, 20, 8)};

        Griffindor[] studyGriffindor = {
                new Griffindor("Garry", "Potter", 20, 25, 12, 15, 8),
                new Griffindor("Hermiona", "Granger", 25,22, 10, 15, 8),
                new Griffindor("Ron", "Wisley", 15,18,6, 20, 8)};

        Kogtevran[] studyKogtevran = {
                new Kogtevran("Chou", "Chang", 13, 20, 10, 15, 8, 12),
                new Kogtevran("Padme", "Patil", 11,13, 10, 5, 8, 20),
                new Kogtevran("Markus", "Bilbi", 23, 22, 6, 20, 8, 7)};

        Slyserin[] studySlyserin = {
                new Slyserin("Drako", "Malfoy", 26, 17, 10, 11, 8, 6, 18),
                new Slyserin("Graham", "Montegu", 19, 18, 10, 16, 8, 6, 4),
                new Slyserin("Gregory", "Goil", 15, 16, 6, 7, 8, 5, 5)};

        printStudents(studyGriffindor);
        printStudents(studyPuffendui);
        printStudents(studyKogtevran);
        printStudents(studySlyserin);
        comparePersonalInfo(studyGriffindor, 0, 2);
        comparePersonalInfo(studyPuffendui, 0, 1);
        comparePersonalInfo(studyKogtevran, 1, 2);
        comparePersonalInfo(studySlyserin, 0, 2);
        compareHogvartsStudent("Slyserin", 0, "Griffindor", 1,
                                studyGriffindor, studyPuffendui, studyKogtevran, studySlyserin);
    }
        private static void printStudents(Griffindor[] students) {
            for (int i = 0; i < students.length; i++) {
                System.out.println("Griffindor Student - " + students[i]);
            }
        }
        private static void printStudents(Puffendui[] students) {
            for (int i = 0; i < students.length; i++) {
                System.out.println("Puffendui Student - " + students[i]);
            }
        }
        private static void printStudents(Kogtevran[] students) {
            for (int i = 0; i < students.length; i++) {
                System.out.println("Kogtevran Student - " + students[i]);
            }
        }
        private static void printStudents(Slyserin[] students) {
            for (int i = 0; i < students.length; i++) {
                System.out.println("Slyserin Student - " + students[i]);
            }
        }

        private static void comparePersonalInfo(Griffindor[] temp, int stud1, int stud2) {
            String student1 = temp[stud1].getName() + " " + temp[stud1].getSecondName();
            String student2 = temp[stud2].getName() + " " + temp[stud2].getSecondName();
            int totalStud1 = temp[stud1].getNobylity() + temp[stud1].getHonor() + temp[stud1].getBravery();
            int totalStud2 = temp[stud2].getNobylity() + temp[stud2].getHonor() + temp[stud2].getBravery();
            if (totalStud1 > totalStud2) {
                System.out.println(student1 + " лучший Гриффиндоровец, чем " + student2);
            } else if (totalStud1 < totalStud2) {
                System.out.println(student2  + " лучший Гриффиндоровец, чем " + student1);
            } else {
                System.out.println("Студенты " + student1 + " и " + student2 + " равны");
            }
        }
        private static void comparePersonalInfo(Puffendui[] temp, int stud1, int stud2) {
            String student1 = temp[stud1].getName() + " " + temp[stud1].getSecondName();
            String student2 = temp[stud2].getName() + " " + temp[stud2].getSecondName();
            int totalStud1 = temp[stud1].getHardWork() + temp[stud1].getLoyal() + temp[stud1].getHonest();
            int totalStud2 = temp[stud2].getHardWork() + temp[stud2].getLoyal() + temp[stud2].getHonest();
            if (totalStud1 > totalStud2) {
                System.out.println(student1 + " лучший Пуффендуевец, чем " + student2);
            } else if (totalStud1 < totalStud2) {
                System.out.println(student2  + " лучший Пуффендуевец, чем " + student1);
            } else {
                System.out.println("Студенты " + student1 + " и " + student2 + " равны");
            }
        }
        private static void comparePersonalInfo(Kogtevran[] temp, int stud1, int stud2) {
            String student1 = temp[stud1].getName() + " " + temp[stud1].getSecondName();
            String student2 = temp[stud2].getName() + " " + temp[stud2].getSecondName();
            int totalStud1 = temp[stud1].getSmart() + temp[stud1].getWise() + temp[stud1].getWitty() + temp[stud1].getCreativity();
            int totalStud2 = temp[stud2].getSmart() + temp[stud2].getWise() + temp[stud2].getWitty() + temp[stud2].getCreativity();
            if (totalStud1 > totalStud2) {
                System.out.println(student1 + " лучший Когтевранец, чем " + student2);
            } else if (totalStud1 < totalStud2) {
                System.out.println(student2  + " лучший Когтеврранец, чем " + student1);
            } else {
                System.out.println("Студенты " + student1 + " и " + student2 + " равны");
            }
        }
        private static void comparePersonalInfo(Slyserin[] temp, int stud1, int stud2) {
            String student1 = temp[stud1].getName() + " " + temp[stud1].getSecondName();
            String student2 = temp[stud2].getName() + " " + temp[stud2].getSecondName();
            int totalStud1 = temp[stud1].getCunning() + temp[stud1].getDetermination() + temp[stud1].getAmbition() +
                    temp[stud1].getResourceFulness() + temp[stud1].getPower();
            int totalStud2 = temp[stud2].getCunning() + temp[stud2].getDetermination() + temp[stud2].getAmbition() +
                    temp[stud2].getResourceFulness() + temp[stud2].getPower();
            ;
            if (totalStud1 > totalStud2) {
                System.out.println(student1 + " лучший ученик Слизерина, чем " + student2);
            } else if (totalStud1 < totalStud2) {
                System.out.println(student2 + " лучший ученик Слизерина, чем " + student1);
            } else {
                System.out.println("Студенты " + student1 + " и " + student2 + " равны");
            }
        }

        public static void compareHogvartsStudent(String fakultet1, int stud1, String fakultet2, int stud2,
                                                  Griffindor[] faGriffindor, Puffendui[] faPuffendui,
                                                  Kogtevran[] faKogtevran, Slyserin[] faSlyserin) {
            String student1 = "Unknown", student2 = "Unknown";
            int power1 = -1, power2 = -1;
            switch (fakultet1) {
                case ("Griffindor") :
                {
                    power1 = faGriffindor[stud1].getMagicPower() + faGriffindor[stud1].getTransgression();
                    student1 = faGriffindor[stud1].getName() + " " + faGriffindor[stud1].getSecondName();
                    break;
                }
                case ("Puffendui") :
                {
                    power1 = faPuffendui[stud1].getMagicPower() + faPuffendui[stud1].getTransgression();
                    student1 = faPuffendui[stud1].getName() + " " + faPuffendui[stud1].getSecondName();
                    break;
                }
                case ("Kogtevran") :
                {
                    power1 = faKogtevran[stud1].getMagicPower() + faKogtevran[stud1].getTransgression();
                    student1 = faKogtevran[stud1].getName() + " " + faKogtevran[stud1].getSecondName();
                    break;
                }
                case ("Slyserin") :
                {
                    power1 = faSlyserin[stud1].getMagicPower() + faSlyserin[stud1].getTransgression();
                    student1 = faSlyserin[stud1].getName() + " " + faSlyserin[stud1].getSecondName();
                    break;
                }
                default :
                {
                    System.out.println("Такого факультета нет");
                    break;
                }
            }
            switch (fakultet2) {
                case ("Griffindor") :
                {
                    power2 = faGriffindor[stud2].getMagicPower() + faGriffindor[stud2].getTransgression();
                    student2 = faGriffindor[stud2].getName() + " " + faGriffindor[stud2].getSecondName();
                    break;
                }
                case ("Puffendui") :
                {
                    power2 = faPuffendui[stud2].getMagicPower() + faPuffendui[stud2].getTransgression();
                    student2 = faPuffendui[stud2].getName() + " " + faPuffendui[stud2].getSecondName();
                    break;
                }
                case ("Kogtevran") :
                {
                    power2 = faKogtevran[stud2].getMagicPower() + faKogtevran[stud2].getTransgression();
                    student2 = faKogtevran[stud2].getName() + " " + faKogtevran[stud2].getSecondName();
                    break;
                }
                case ("Slyserin") :
                {
                    power2 = faSlyserin[stud2].getMagicPower() + faSlyserin[stud2].getTransgression();
                    student2 = faSlyserin[stud2].getName() + " " + faSlyserin[stud2].getSecondName();
                    break;
                }
                default :
                {
                    System.out.println("Такого факультета нет");
                    break;
                }
            }
            if (power1 >= 0 && power2 >= 0) {
                if (power1 > power2) {
                    System.out.println(student1 + " обладает большей мощностью магии, чем " + student2);
                } else if (power1 < power2) {
                    System.out.println(student2 + " обладает большей мощностью магии, чем " + student1);
                } else {
                    System.out.println("У " + student1 + " и " + student2 + " магия равна");
                }
            }
        }
}