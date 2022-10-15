// Example of try catch block

class ExceptionExample{
    static void main(String[] args){
        try {
            def arr = new int[3]
            arr[5] = 5
        }catch(ArrayIndexOutOfBoundsException ex){
            println(ex.toString())
            println(ex.getMessage())
            println(ex.getStackTrace())

        }catch(Exception ex) {
            println("Catching the exception")
        }finally{
            println("The Final Block")
        }

        println("let move the after the Exception")
    }

}