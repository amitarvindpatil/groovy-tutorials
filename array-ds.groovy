// Array

class ArrayExample{
    static void main(String[] args){
        def lst = [10,20,30,50,40] 

        // add() - append the value
        lst.add('Amit')
        println(lst)

        // contains() - value exists in array or not
        println(lst.contains(40))

        // get() - return a specific position value
        println(lst.get(2))

        // isEmpty() - return true/False if array is empty

        println(lst.isEmpty())

        // minus() 
        def lst2 = []
        lst2 = lst.minus([10,20])
        println(lst2)

        // plus() - add list element into another list

        lst2 = lst.plus([15,16]);
        println(lst2)

        // pop() - remove last element of array

        lst.pop()
        println(lst)

        // remove() - remove specific position value

        lst.remove(2)
        println(lst)

        // reverse()

        def data = lst.reverse()
        println(data)

        // size() - size or length of array
        
        def data = lst.size()
        println(data)

        // Sort()
        def data = lst.sort()
        println(data)
        

    }
}