package nl.hannahsten.texifyidea.index

import com.intellij.psi.stubs.StringStubIndexExtension
import nl.hannahsten.texifyidea.psi.LatexCommands

/**
 * @author Hannah Schellekens
 */
open class LatexDefinitionIndex : StringStubIndexExtension<LatexCommands>() {

    companion object : IndexCommandsUtilBase(IndexKeys.DEFINITIONS_KEY)

    override fun getKey() = Companion.key()
}