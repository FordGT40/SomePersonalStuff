package com.wisdom.project.homepage.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wisdom.project.R

/**
 * @ProjectName project： ExtraProject
 * @class package：com.wisdom.project.homepage.fragment
 * @class describe：我的
 * @author HanXueFeng
 * @time 2019/1/2 9:51
 * @change
 */
class MineFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mine, null, false)
    }

}