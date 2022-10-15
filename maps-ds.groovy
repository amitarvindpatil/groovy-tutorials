// maps example or Dictionary 

class MapsExample{
    static void main(String[] args){

        def mp = ["Topic":"MapFunction","Duration": 12]

        // containsKey - return true or false to check keys are present or not
        println(mp.containsKey("Topic"))
        println(mp.containsKey("Duration"))

        // Access values with get() and index

        println(mp["Topic"])
        println(mp.get("Topic"))

        // keySet() - return array of keys
        println(mp.keySet())

        // put() - add value into maps
        mp.put("Location","Sangli")
        println(mp)

        // size() - return length or size of maps
        println(mp.size())

        // values() - return list of all values in maps

        println(mp.values())

    }
}