fun main(){
    // comparison
    val message = "come here"
    val message1 = "come here"
    if(message == message1){
        println(true)
    }
    val text = "I love you"
    val text1 = "I hate you"
    if (text.equals(text1)){
        println(true)}
    else{
        println(false)
    }
    val phone = "sumsung"
    val phone1 = "Itel"
    if (phone.equals(phone1)){
        println(true)}
    else{
        println(false)
    }
    // manipulation of words using string
    val x = "akunda fostina"
    println(x.toUpperCase())
    println(x.lowercase())
    println(x.capitalize())
    println(x.decapitalize())
    // more
    val city = "kampala"
    println(city.uppercase())
    println(city.lowercase())
    println(city.capitalize())
    //empty and blank space

    val emptystring = ""
    val blankstring = " "
    println(emptystring.isBlank())
    println(emptystring.isEmpty())
    println(blankstring.isEmpty())
    println(blankstring.isBlank())
// converting an object of another type to strins.
    val weight = 60
    val statement = "I am $weight kg"
    println(statement)

    val height = 100
    val comment = "Minage is $height fit"
    println(comment)
    // or
    val length = 180
    println("The distance is "+ length.toString() )

    val width = 100
    val state = "The width of the box is $width cm"
    println(state)

    val name = "mitchelle Hope"
    val r = name[4].toString()+name[5]+name[6]+name[7]+name[11]
    println(r)
    val z = name[4].toString()+name[5]+name[6]+name[7]
    println(z)
    val b = name[4].toString()+name[5]+name[6]+name[12]
    println(b)

    val sentence = "prudence comes from uganda. "+ "she is the most loved"
    println(sentence.replace("uganda","kenya"))

    val h = "Minage is a friend to susan. "+ "They sleep in the same room"
    println(h.replace("a friend","an enemy"))

    val note = "Lovelace is the most hated class at Akirachix. "+ "It has 33 students"
    println(note.replace("hated","loved"))

    val t = "Nevernce is the most loved at home."
    println(t.replace("Nevernce","Prudence"))






}