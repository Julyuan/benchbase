/******************************************************************************
 *  Copyright 2015 by OLTPBenchmark Project                                   *
 *                                                                            *
 *  Licensed under the Apache License, Version 2.0 (the "License");           *
 *  you may not use this file except in compliance with the License.          *
 *  You may obtain a copy of the License at                                   *
 *                                                                            *
 *    http://www.apache.org/licenses/LICENSE-2.0                              *
 *                                                                            *
 *  Unless required by applicable law or agreed to in writing, software       *
 *  distributed under the License is distributed on an "AS IS" BASIS,         *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 *  See the License for the specific language governing permissions and       *
 *  limitations under the License.                                            *
 ******************************************************************************/

package com.oltpbenchmark.benchmarks.twitter;

import com.oltpbenchmark.api.AbstractTestLoader;

public class TestTwitterLoader extends AbstractTestLoader<TwitterBenchmark> {

    private final String[] IGNORED_TABLES = {
            TwitterConstants.TABLENAME_ADDED_TWEETS
    };

    @Override
    protected void setUp() throws Exception {
        super.setUp(TwitterBenchmark.class, IGNORED_TABLES, TestTwitterBenchmark.PROC_CLASSES);
        this.workConf.setScaleFactor(0.1);
    }

}
