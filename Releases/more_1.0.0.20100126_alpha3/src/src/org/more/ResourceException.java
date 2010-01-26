/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.more;
/**
 * ��Դ�����쳣��
 * @version 2009-4-29
 * @author ������ (zyc@byshell.org)
 */
public class ResourceException extends RuntimeException {
    /**  */
    private static final long serialVersionUID = 1150252197473827738L;
    /**
    * ��Դ�����쳣��
    * @param string �쳣��������Ϣ
    */
    public ResourceException(String string) {
        super(string);
    }
    /**
     * ��Դ�����쳣��
     * @param error �쳣��������Ϣ
     */
    public ResourceException(Throwable error) {
        super(error);
    }
    /**
     * ��Դ�����쳣��
     * @param string �쳣��������Ϣ��
     * @param error �нӵ���һ���쳣����
     */
    public ResourceException(String string, Throwable error) {
        super(string, error);
    }
}