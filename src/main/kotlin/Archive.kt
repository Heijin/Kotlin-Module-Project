class Archive(var name: String)
{
    var noteList: MutableList<Note> = mutableListOf()

    override fun toString(): String {
        if (name.isEmpty())
        return "<без названия>"
        else return name

    }

}






