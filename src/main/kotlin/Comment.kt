data class Comment(
    val id : Int,
    val postId : Int,
    val fromId : Int,
    val date : Int,
    val text : String,
    val donut : Donut?,
    val attachments : Array<Attachment>? = emptyArray(),
    val parentsStack : Array<Int>? = emptyArray(),
    val thread : Thread?
)

data class Thread(
    val count : Int,
    val items : Array<Int>? = emptyArray(),
    val canPost : Boolean,
    val ShowReplyButton : Boolean,
    val groupsCanPost : Boolean
)