package com.ebiznext.comet.utils

import com.ebiznext.comet.model.CometModel.Tag
import org.scalatest.{ BeforeAndAfter, BeforeAndAfterAll, FlatSpec }

/**
 * Created by Mourad on 23/07/2018.
 */
class SerDeUtilsSpec extends FlatSpec with BeforeAndAfter with BeforeAndAfterAll {

  "SerDeUtils" should "work on any Class" in {
    import SerDeUtils._
    val id: Int = 12345
    val key: String = "KEY1"
    val caseClass: Tag = Tag("tagId", tags = Seq("tag1", "tag2"))

    assert(id == deserialize(serialize(id)).asInstanceOf[Int])
    assert(key == deserialize(serialize(key)).asInstanceOf[String])
    assert(caseClass == deserialize(serialize(caseClass)).asInstanceOf[Tag])

  }
}
