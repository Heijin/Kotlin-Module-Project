import java.util.Scanner

class SomeFunc {

    inline fun <reified T> printList (textNew: String, list: MutableList<T>)
    {
        println(textNew)
        for (index in list.indices)
        println(""+(index+1)+". "+ list.get(index))
        println(""+(list.count()+1)+". Выход")
    }

    fun getNumberList (countList: Int) : Int
    {
        println("Введите цифру из меню")
        val input = Scanner(System.`in`)

        while (true)
        {
            val number: String = input.nextLine()
            var intNumber = 0
            try {
                intNumber = number.toInt()
            } catch (ex: NumberFormatException) {
                println("Следует вводить только цифры")
                return -1
            }

            if (intNumber >= 0  && intNumber <= countList+1 ) return intNumber
            else
            {
                println("Такой цифры нет в меню")
                return -1
            }
        }
    }

    fun createArchive(archiveList: MutableList<Archive>)
    {
        println("Введите название нового архива")
        val name = Scanner(System.`in`).nextLine()
        archiveList.add(Archive(name))
    }

    fun createNote (selectedArchive: Archive)
    {
        println("Введите название заметки")
        val noteName = Scanner(System.`in`).nextLine()
        println("Введите описание заметки")
        val noteDesc = Scanner(System.`in`).nextLine()
        selectedArchive.noteList.add(Note(noteName, noteDesc))
    }

}