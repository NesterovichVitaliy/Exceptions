class GraffitiAttachment(param : Graffiti) : Attachment {
    override val type: String = "graffiti"
    val graffiti = param

    override fun toString() : String{
        return "\n  $graffiti"
    }
}