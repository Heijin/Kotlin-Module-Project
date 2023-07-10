class Note(val name: String, val text: String)
{
    override fun toString(): String {
        if (name.isEmpty())
            return "<без названия>"
            else return name
    }
    fun viewNote () {
        if (name.isEmpty())
        println("Название: <без названия>")
        else println("Название: "+name)

        if (text.isEmpty())
        println("Описание: <без описания>")
        else println("Описание: "+text+"\n")
    }
}



