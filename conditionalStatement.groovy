// if Statement

class IfStatement{
    static void main(String[] args){
        int a = 2

        if(a<100){
            println("The value is less than 100")
        }
    }
}

// If-else Statement

class IfElseStatement{
    static void main(String[] args){
        int[] arr = [1,2,3,4,5,6,7,8,9,10]

        for (i in arr){
            if (i % 2 == 0){
                println("odd number" + i + "\n")
            }
            else{
                println("even number" +i +"\n")
            } 
        }
    }
}

// If-else-if State ment

class IfElseIfStatement{
    static void main(String[] args){
        int i = 20

        if (i<100){
            
            println("Value is less than 100")
        }
        else if(i>5){
            println("Value is greater than 5 and less than 100")
        }
        else{
            println("valuse is less than 5")
        }
    }
}

// Swtich Statement
class SwitchStatement{
    static void main(String[] args){
        int i = 2

        switch(i) {
            case 1:
                println("i is one")     
                break
            case 2:
                println("i is two")     
                break
            case 3:
                println("i is three")     
                break

            default:
                println("Value is unknown")
                break
        }
    }
}

// Nested Switch Statement

class NestedSwitchStatement{
    static void main(String[] args){
        int i = 0
        int j = 1
    
    switch(i){
        case 0:
            switch(j){
                case 1:
                    println("value of j is 1")
                    break
                case 2:
                    println("valuse of j is 2")
                    break
                
                default:
                    println("value of j is unknown")
                    break
            }
        break
        default:
            println("value of i is unkown")
            break
            
    }
    
    }
}