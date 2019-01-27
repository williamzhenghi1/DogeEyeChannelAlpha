package com.dogeye.Utils;

import com.dogeye.Emus.ChannelEmus;
import com.dogeye.vo.ResultsVo;

public class ResultsVoUtils {
    public static ResultsVo success(Object object)
    {
        ResultsVo resultsVo =new ResultsVo();
        resultsVo.setCode(ChannelEmus.Success.getCode());
        resultsVo.setMsg(ChannelEmus.Success.getMsg());
        resultsVo.setObject(object);
        return resultsVo;
    }

    public static ResultsVo fail()
    {
        ResultsVo resultsVo =new ResultsVo();
        resultsVo.setCode(ChannelEmus.NOT_FOUNT_Faild.getCode());
        resultsVo.setMsg(ChannelEmus.NOT_FOUNT_Faild.getMsg());
        resultsVo.setObject(null);
        return resultsVo;
    }
}
