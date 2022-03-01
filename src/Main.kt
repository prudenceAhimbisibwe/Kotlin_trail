fun main(){
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






}