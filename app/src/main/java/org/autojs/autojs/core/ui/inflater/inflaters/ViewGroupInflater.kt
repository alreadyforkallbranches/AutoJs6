package org.autojs.autojs.core.ui.inflater.inflaters

import android.view.ViewGroup
import org.autojs.autojs.core.ui.inflater.ResourceParser

/**
 * Created by Stardust on 2017/11/4.
 * Transformed by SuperMonster003 on May 20, 2023.
 */
open class ViewGroupInflater<V : ViewGroup>(resourceParser: ResourceParser) : BaseViewInflater<V>(resourceParser) {

    open fun applyPendingAttributesOfChildren(view: V) {}

}