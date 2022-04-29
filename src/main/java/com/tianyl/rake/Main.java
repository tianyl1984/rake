package com.tianyl.rake;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.SegToken;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        JiebaSegmenter jiebaSegmenter = new JiebaSegmenter();
        String str = "应对高并发服务器端开发场景";
        List<SegToken> tokens = jiebaSegmenter.process(str, JiebaSegmenter.SegMode.SEARCH);
        for (SegToken token : tokens) {
            System.out.println(token.word);
        }
        System.out.println("---------------------");
        tokens = jiebaSegmenter.process(str, JiebaSegmenter.SegMode.INDEX);
        for (SegToken token : tokens) {
            System.out.println(token.word);
        }
    }

}
