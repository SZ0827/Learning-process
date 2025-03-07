package com.sz.demo;

import java.util.HashMap;
import java.util.Map;

public class romaToInt {
    public static void main(String[] args) {
        String X="MCMXCIV";
        System.out.println(new romaToInt().romanToInt(X));
        System.out.println(romaToInt2(X));
    }

        public int romanToInt(String s) {
            int index = 0;
            int zz = 0;
            char[] str = s.toCharArray();
            int[] answer = new int[str.length];
            int counter = 0;
            while (true) {
                // ========================================

                if (index < str.length - 1) {
                    switch (str[index]) {
                        case 'I':
                            if (str[index + 1] == 'V') {
                                index += 2;
                                answer[counter] = 4;
                                counter++;
                            } else if (str[index + 1] == 'X') {
                                index += 2;
                                answer[counter] = 9;
                                counter++;

                            } else {
                                index++;
                                answer[counter] = 1;
                                counter++;

                            }
                            break;
                        case 'V':
                            index++;
                            answer[counter] = 5;
                            counter++;
                            break;
                        case 'X':
                            if (str[index + 1] == 'L') {
                                index += 2;
                                answer[counter] = 40;
                                counter++;
                            } else if (str[index + 1] == 'C') {
                                index += 2;
                                answer[counter] = 90;
                                counter++;

                            } else {
                                index++;
                                answer[counter] = 10;
                                counter++;

                            }
                            break;
                        case 'L':
                            index++;
                            answer[counter] = 50;
                            counter++;
                            break;

                        case 'C':
                            if (str[index + 1] == 'D') {
                                index += 2;
                                answer[counter] = 400;
                                counter++;
                            } else if (str[index + 1] == 'M') {
                                index += 2;
                                answer[counter] = 900;
                                counter++;

                            } else {
                                index++;
                                answer[counter] = 100;
                                counter++;

                            }
                            break;
                        case 'D':
                            index++;
                            answer[counter] = 500;
                            counter++;
                            break;
                        case 'M':
                            index++;
                            answer[counter] = 1000;
                            counter++;
                            break;
                        default:
                            zz = -1;
                            break;

                    }
                } else {
                    switch (str[index]) {
                        case 'I':

                            index++;
                            answer[counter] = 1;
                            counter++;


                            break;
                        case 'V':
                            index++;
                            answer[counter] = 5;
                            counter++;
                            break;
                        case 'X':

                            index++;
                            answer[counter] = 10;
                            counter++;


                            break;
                        case 'L':
                            index++;
                            answer[counter] = 50;
                            counter++;
                            break;

                        case 'C':

                            index++;
                            answer[counter] = 100;
                            counter++;


                            break;
                        case 'D':
                            index++;
                            answer[counter] = 500;
                            counter++;
                            break;
                        case 'M':
                            index++;
                            answer[counter] = 1000;
                            counter++;
                            break;
                        default:
                            zz = -1;
                            break;

                    }

                }

                if (index > str.length - 1 || zz == -1) {
                    break;
                }

            }

            // ====================
            int sum = 0;
            for (int i = 0; i < answer.length; i++) {
                sum += answer[i];
            }

            return sum;
        }
        public static int romaToInt2(String s) {
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int total=0;
        int preValue=0;
        if(s==null||s.isEmpty()){
            return 0;
        }
        for(int i=s.length()-1;i>=0;i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);
            if (currentValue < preValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            preValue = currentValue;
        }
        return total;
        }
    }



