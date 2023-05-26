import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun updateExisting() {
        val service = WallService

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

        service.add(
            Post(
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
        )
        service.add(
            Post(
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
        )
        service.add(
            Post(
                3,
                90,
                90,
                90,
                1636119520,
                "Пустота",
                11,
                11,
                true,
                Comments(20, true, true, false, false),
                Copyright(578, "url", "text", "type"),
                Likes(710, true, true, true),
                Reposts(500, false),
                Views(1500),
                "post",
                null,
                arrayOf(attachmentAudio, attachmentGift),
                null,
                80,
                null,
                true,
                true,
                true,
                false,
                true,
                true,
                1
            )
        )
        val update = Post(
            1,
            76,
            76,
            76,
            1636018520,
            "Пустота",
            1,
            1,
            false,
            Comments(88, true, true, false, false),
            Copyright(571, "url", "text", "type"),
            Likes(750, true, true, true),
            Reposts(130, false),
            Views(5000),
            "post",
            null,
            arrayOf(attachmentVideo, attachmentGraffiti),
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
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        val service = WallService

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

        service.add(
            Post(
                1,
                76,
                76,
                76,
                1636018520,
                "Пустота",
                1,
                1,
                false,
                Comments(88, true, true, false, false),
                Copyright(571, "url", "text", "type"),
                Likes(750, true, true, true),
                Reposts(130, false),
                Views(5000),
                "post",
                null,
                arrayOf(attachmentVideo, attachmentGraffiti),
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
        )
        service.add(
            Post(
                2,
                90,
                90,
                90,
                1636119520,
                "Пустота",
                11,
                11,
                true,
                Comments(20, true, true, false, false),
                Copyright(578, "url", "text", "type"),
                Likes(710, true, true, true),
                Reposts(500, false),
                Views(1500),
                "post",
                null,
                arrayOf(attachmentAudio, attachmentGift),
                null,
                80,
                null,
                true,
                true,
                true,
                false,
                true,
                true,
                1
            )
        )
        service.add(
            Post(
                3,
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
        )
        val update = Post(
            22244,
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
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun add() {
        val service = WallService

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

        val postNew = service.add(
            Post(
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
                arrayOf(attachmentGraffiti, attachmentGift, attachmentPhoto, attachmentAudio, attachmentVideo),
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
        )
        assertTrue(postNew.id > 0)
    }

    @Test
    fun shouldntThrow() {

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

        val attachmentPhoto = PhotoAttachment(photo)

        val post = Post(
            1,
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
            arrayOf(attachmentPhoto),
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

        WallService.add(post)

        val comment = Comment(
            1,
            1,
            232153454,
            5464253,
            "comment",
            null,
            arrayOf(attachmentPhoto),
            null,
            null
        )

        val result = WallService.createComment(comment)

        assertTrue(result)
    }

    @Test (expected = PostNotFoundException::class)
    fun shouldThrow() {

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

        val attachmentPhoto = PhotoAttachment(photo)

        val post = Post(
            1,
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
            arrayOf(attachmentPhoto),
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

        WallService.add(post)

        val comment = Comment(
            1,
            546,
            232153454,
            5464253,
            "comment",
            null,
            arrayOf(attachmentPhoto),
            null,
            null
        )

        WallService.createComment(comment)
    }
}