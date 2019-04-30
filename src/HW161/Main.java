package HW161;

class Main {
    public static boolean validateTask(boolean notEmpty, int taskId, int currentId){

        return notEmpty && (taskId - currentId == 1);
    }


    static void checkList(){
        System.out.println(validateTask(true, 2,1));
        System.out.println(validateTask(true, 3,1));
        System.out.println(validateTask(false, 3,2));

    }




    public static void main(String[] args) {
        checkList();
    }

}




