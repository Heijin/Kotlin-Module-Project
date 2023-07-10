
fun main(args: Array<String>) {

    var archiveList: MutableList<Archive> = mutableListOf()
    var selectedArchive: Archive? = null
    var countList = 0
    val someFunc = SomeFunc()

    while (true) { // Основной цикл по архивам

        if (selectedArchive == null) {
            someFunc.printList("0. Создать архив", archiveList)
            countList = archiveList.count()
        }
        else
        {
            someFunc.printList("0. Создать заметку", selectedArchive.noteList)
            countList = selectedArchive.noteList.count()
        }

        val result = someFunc.getNumberList(countList)

        when (result){
            -1 -> continue //При неверных вводах, повторяем список меню
            0 -> { // Механика создания
                if (selectedArchive == null) someFunc.createArchive(archiveList)
                else someFunc.createNote(selectedArchive)
            }
            countList + 1 -> { // Механика возврата
                if (selectedArchive == null) {
                    println("Выход из архивов и программы")
                    break
                } else {
                    println("Возврат к архивам")
                    selectedArchive = null
                }
            }
            else -> { // Механика выбора/просмотра
                if (selectedArchive == null) selectedArchive = archiveList.get(result-1)
                else selectedArchive.noteList.get(result-1).viewNote()
            }
        }
    }
}



