fun main() {

    val audio = Audio(
        1,
        241,
        "artist",
        "title",
        3234,
        "url",
        123,
        56,
        3,
        34234,
        false,
        true
    )

    val gift = Gift(
        1,
        "256",
        "96",
        "48"
    )

    val graffiti = Graffiti(
        1,
        23431,
        "url",
        50,
        50
    )

    val photo = Photo(
        4358394,
        324,
        234545435,
        54645,
        "text",
        3523552,
        arrayOf(Sizes("size", "url", 11, 44)),
        178,
        923
    )

    val video = Video(
        1297413,
        16546854,
        "title",
        "video",
        105,
        null,
        null,
        232347523,
        33232323,
        3000,
        345,
        100,
        "player",
        "platform",
        true,
        true,
        "accessKey",
        false,
        false,
        false,
        true,
        true,
        false,
        false,
        true,
        true,
        150,
        304,
        3242342,
        true,
        false,
        true,
        true,
        "type",
        34,
        "Status",
        true,
        false,
        10,
        VideoLikes(57, true),
        VideoReposts(45, 234234, 434, false)
    )

    val attachmentVideo = VideoAttachment(video)
    val attachmentAudio = AudioAttachment(audio)
    val attachmentPhoto = PhotoAttachment(photo)
    val attachmentGraffiti = GraffitiAttachment(graffiti)
    val attachmentGift = GiftAttachment(gift)

    val post1 = Post(
        1,
        30,
        30,
        30,
        1635019520,
        "Пустота",
        7,
        7,
        true,
        Comments(5, true, true, false, false),
        Copyright(555, "url", "text", "type"),
        Likes(25, true, true, true),
        Reposts(23, false),
        Views(21),
        "post",
        null,
        arrayOf(attachmentAudio, attachmentVideo),
        null,
        55,
        null,
        true,
        true,
        true,
        false,
        true,
        true,
        1
    )

    val post2 = Post(
        2,
        70,
        70,
        70,
        1636019520,
        "Пустота",
        6,
        6,
        true,
        Comments(9, true, true, false, false),
        Copyright(555, "url", "text", "type"),
        Likes(75, true, true, true),
        Reposts(13, false),
        Views(500),
        "post",
        null,
        arrayOf(attachmentGraffiti, attachmentGift, attachmentPhoto),
        null,
        55,
        null,
        true,
        true,
        true,
        false,
        true,
        true,
        1
    )

    WallService.add(post1)
    WallService.add(post2)

    WallService.print()

    val comment = Comment(
        1,
        1,
        232153454,
        5464253,
        "comment",
        null,
        arrayOf(attachmentVideo),
        null,
        null
    )

    try {
        WallService.createComment(comment)
    } catch (e: PostNotFoundException){
        println(e.message)
    }
}
