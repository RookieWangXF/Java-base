package cn.rookie.state;

/**
 * Created by Rookie on 2016/4/12.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */

import java.util.HashMap;
import java.util.Map;


interface VoteState {
    /**
     *
     * @Name: vote   处理状态的行为
     * @Description: @param user   投票人
     * @Description: @param voteItem	投票项目
     * @Description: @param voteManage	投票上下文
     * @Return: void
     */
    public void vote(String user, String voteItem, VoteManage voteManage);
}

/*
 * 具体投票状态--正常投票
 */
class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManage voteManage) {
        voteManage.getMapVoteMap().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }

}

/*
 * 具体投票状态--重复投票
 */
class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManage voteManage) {
        System.out.println("请不要重复投票");
    }

}

/*
 * 具体投票状态--恶意刷票
 */
class SpiteVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManage voteManage) {
        // 恶意投票，取消用户的投票资格，并取消投票记录
        String str = voteManage.getMapVoteMap().get(user);
        if(str != null){
            voteManage.getMapVoteMap().remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
    }

}

class VoteManage {
    private VoteState state = null;
    private Map<String, String> mapVote = new HashMap<String, String>();
    private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();

    /*
     * 获取用户投票结果的Map
     */
    public Map<String, String> getMapVoteMap() {
        return mapVote;
    }
    /**
     * 投票
     * @param user    投票人
     * @param voteItem    投票的选项
     */
    public void vote(String user, String voteItem){
        //1.为该用户增加投票次数
        //从记录中取出该用户已有的投票次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if(oldVoteCount == null){
            oldVoteCount = 0;
        }
        oldVoteCount += 1;
        mapVoteCount.put(user, oldVoteCount);
        //2.判断该用户的投票类型，就相当于判断对应的状态
        //到底是正常投票、重复投票、恶意投票还是上黑名单的状态
        if(oldVoteCount == 1){
            state = new NormalVoteState();
        }
        else if(oldVoteCount > 1 && oldVoteCount < 5){
            state = new RepeatVoteState();
        }
        else if(oldVoteCount >= 5 && oldVoteCount <8){
            state = new SpiteVoteState();
        }

        //然后转调状态对象来进行相应的操作
        state.vote(user, voteItem, this);
    }
}


public class Demo01 {

    public static void main(String[] args) {

    }

}
