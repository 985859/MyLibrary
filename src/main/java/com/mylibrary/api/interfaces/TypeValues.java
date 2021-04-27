package com.mylibrary.api.interfaces;

/**
 * @author: hukui
 * @date: 2019/9/20
 */
public interface TypeValues {
    int DATA = 10003;//刷新数据;
    //渐变的方向 只有线性渐变时有效
    int TOP_BOTTOM = 0;
    int TR_BL = 1;
    int RIGHT_LEFT = 2;
    int BR_TL = 3;
    int BOTTOM_TOP = 4;
    int BL_TR = 5;
    int LEFT_RIGHT = 6;
    int TL_BR = 7;

    //渐变的类别
    int LINEAR = 0;
    int RADIAL = 1;
    int SWEEP = 2;

    //shape
    int RECTANGLE = 0;
    int OVAL = 1;
    int LINE = 2;
    int RING = 3;

}
