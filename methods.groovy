// Simple Method/function

class MyFunction{

    static def display(){
        println("Hellow world this is groovy language")
    }

    static void main(String[] args){
        display()
    }
}

// methods parameters
class ParamFunction{

    static def sum(int i,int j){
        int k = i + j
        println("Output of k is" +k)
    }

    static void main(String[] args){
        sum(10,20)
    }
}

// Default Parameters

// if we pass parameters throght function output is coming as 10
class DefaultParamFunction{

    static def sum(int i = 10,int j = 20){
        int k = i + j
        println("Output of k is" +k)
    }

    static void main(String[] args){
        sum()
    }
}

// Method return a value

class RuturnMethod{
    static def addition(int i,int j = 20){
        int k = i + j
        return k
    }

    static void main(String[] args){
        println("value of k is "+addition(10))
    }
}

// Local and global paramenter

class ScopeExample{
    static int x = 10

    static def local(){
        int j = 20
        int k = x + j

        return k
    }

    static void main(String[] args){
        println("value of k is "+local())
    }
}

// this keyword in method

class ThisExample{
    static int x = 10

    static def thisfunc(){
        this.x = 200
        return x
    }

    static void main(String[] args){
        println("value of x is "+thisfunc())
    }
}