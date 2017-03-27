package com.quzhi.evictor;

import com.google.common.util.concurrent.Uninterruptibles;
import com.stoyanr.evictor.ConcurrentMapWithTimedEviction;
import com.stoyanr.evictor.map.ConcurrentHashMapWithTimedEviction;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhiqu on 3/27/17.
 */
public class Main1 {

    public static void main(String[] args) throws Exception {
        ConcurrentMapWithTimedEviction<Long, String> map =
            new ConcurrentHashMapWithTimedEviction<>();
        map.put(1L, "a", 2 * 1000L);
        map.put(2L, "b", 4 * 1000L);
        map.put(3L, "c", 6 * 1000L);
        map.put(4L, "d", 8 * 1000L);
        System.out.println(map.size());
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        System.out.println(map.size());
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        System.out.println(map.size());
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        System.out.println(map.size());
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        System.out.println(map.size());
        return;
    }
}
