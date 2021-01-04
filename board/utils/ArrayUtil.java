package board.utils;



// 배열을 사용하는데 도움이 되는 메소드를 모아둔
// ArrayUtil 클래스
public class ArrayUtil {
    // 파라미터로 넘어온 int[]을 쭉 출력하는
    // print(String, int[]) 메소드
    public static void print(String arrayName, int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%s[%d]: %d\n", arrayName, i, intArray[i]);
        }
    }

    // 파라미터로 넘어온 int[] 을 오름차순 정렬하는
    // sortByASC
    public static void sortByASC(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            int number1 = intArray[i];
            int number2 = intArray[i + 1];
            if (number1 > number2) {
                int temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;
                i = -1;
            }
        }
    }

    // 파라미터로 넘어온 int[] 을 내림차순 정렬하는
    // sortByDESC()
    public static void sortByDESC(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            int number1 = intArray[i];
            int number2 = intArray[i + 1];
            if (number1 < number2) {
                int temp = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = temp;
                i = -1;
            }
        }
    }

    // 파라미터로 넘어온 int배열에서
    // 같이 넘어온 숫자가 존재하는지 존재하지 않는지
    // 존재하면 true 존재하지 않으면 false를 리턴하는
    // contains() 메소드
    public static boolean contains(int[] intArray, int number) {
        // for문을 이용해서
        // 만약 intArray[i]와 number가 같으면
        // 그때만 return true 해준다.
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == number) {
                return true;
            }
        }

        return false;
    }

    // 동적 할당에 관련된 메소드들
    // 1. int 배열의 크기를 확인하여 return 하는 size 메소드
    public static int size(int[] intArray) {
        return intArray.length;
    }

    // 2. int 배열에 파라미터로 넘어온 int를 항상 가장 마지막 칸에
    // 추가해주는 add() 메소드
    public static int[] add(int[] intArray, int element) {
        int size = size(intArray);
        // 1. 먼저 intArray의 내용을 잠시 임시 배열에 복사한다.
        // A. 임시배열을 하나 만들어준다.
        int[] temp = new int[size];
        // B. for 문을 사용하여 현재 intArray의 내용을 temp에 담아준다.
        for (int i = 0; i < intArray.length; i++) {
            temp[i] = intArray[i];
        }
        // 2. intArray를 크기가 1 늘어난 int 배열로 새로 초기화한다.
        intArray = new int[size + 1];
        // 3. 임시 배열의 내용을 새로 초기화된 intArray에 넣어준다.
        for (int i = 0; i < size; i++) {
            intArray[i] = temp[i];
        }
        // 4. intArray의 가장 마지막 index에 element를 넣어준다.
        intArray[size] = element;

        return intArray;
    }

    // 사용자가 배열과 index를 넘기면
    // 해당 배열에서 인덱스를 삭제하고
    // 그리고 크기가 줄어든 배열을 리턴하는
    // removeByIndex 메소드
    public static int[] removeByIndex(int[] array, int index) {
        // 현재 array의 크기를 size에 저장한다.
        int size = size(array);

        // 여기서 우리가 생각해볼 것은
        // index가 얼마인지에 따라서
        // 실행되는 코드가 달라져야 한다는것이다.
        // index는 다음과 같은 경우가 가능하다.
        // 1. 아예 유효하지 않은 index
        // 이때는 우리가 파라미터로 넘어온 배열을
        // 그대로 return 해준다.
        if (index < 0 || index > size - 1) {
            return array;
        }

        // 2. 가장 앞인 index
        // A. 임시 배열을 만들어서 현재 배열의 내용을 복사하고
        // B. 현재 배열을 현재크기 -1로 새로 초기화 하고
        // C. 임시 배열에서 i번째 인덱스를 i-1번 인덱스에 넣는 식으로
        // 복사해온다.
        // D. 줄어든 배열을 리턴한다.

        // 3. 가장 뒤에 있는 index
        // A. 임시 배열을 만들어서 현재 배열의 내용을 복사하고
        // B. 현재 배열을 현재크기 -1로 새로 초기화하고
        // C. 임시 배열에서 가장 마지막 인덱스를 제외하고 복사한다.
        // D. 줄어든 배열을 리턴한다.

        // 4. 중간에 있는 index일때
        // A. 임시 배열을 만들어서 현재 배열의 내용을 복사하고
        // B. 현재 배열을 현재크기-1로 새로 초기화하고
        // C. 임시 배열에서 그 인덱스를 제외하고 차례대로 복사한다.
        // D. 줄어든 배열을 리턴한다.

        // A. 임시 배열을 만들어서 현재 배열의 내용을 복사하고
        int[] temp = new int[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }
        // B. 현재 배열을 현재크기-1로 새로 초기화하고
        array = new int[size - 1];

        // 2. 인덱스가 0일때(즉 가장 앞을 지울때)
        if (index == 0) {
            // for문을 1부터 size보다 작을동안 반복하면서
            // array[i-1]에 temp[i]를 넣어준다.
            for (int i = 1; i < size; i++) {
                array[i - 1] = temp[i];
            }
        } else if (index == size - 1) {
            // 3. 인데스가 size-1일때(즉 가장 뒤를 지울때)
            // for문을 0부터 size-1보다 작을동안 반복하면서
            // array[i]에 temp[i]를 넣어준다.
            for (int i = 0; i < size - 1; i++) {
                array[i] = temp[i];
            }
        } else {
            // 4. 인덱스가 그외일때(즉 중간의 어딘가를 지울때)
            // 이때는 for문이 2개가 필요하다
            // 1. 0~index전까지 복사
            for (int i = 0; i < index; i++) {
                array[i] = temp[i];
            }
            // index가 2일땐
            // 0 1 2 3 4
            // 0 1 3 4

            // array[3] = temp[4]

            // 2. index+1~마지막까지 복사
            for (int i = index + 1; i < temp.length; i++) {
                array[i - 1] = temp[i];
            }
        }

        // if - else 가 끝나면
        // array는 크기가 1 줄어든 상태로 변경되었으므로
        // array를 리턴해주자
        return array;
    }

    // 해당 배열에서 특정 요소가
    // 몇번 인덱스에 있는지 확인하는
    // indexOf() 메소드
    // 단 해당 배열에서 그 요소가 존재하지 않으면
    // -1을 return 한다.
    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }

    // 인덱스가 아니라 파라미터로 넘어온 element와 동일한
    // element를 삭제하는 remove 메소드
    public static int[] remove(int[] array, int element) {
        return removeByIndex(array, indexOf(array, element));
    }

    // 3시 50분까지
    // 현재 우리가 만든 메소드들 중에서
    // add, indexOf, removeByIndex, remove, contains를
    // String 기준으로 오버로딩해서 만들어보세요.
    public static String[] add(String[] array, String element) {
        int size = array.length;
        String[] temp = new String[size];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = new String[size + 1];
        for (int i = 0; i < size; i++) {
            array[i] = temp[i];
        }
        array[size] = element;

        return array;
    }

    public static int indexOf(String[] array, String element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public static String[] removeByIndex(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            return array;
        }

        String[] temp = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        
        array = new String[temp.length - 1];
        
        if(index == 0) {
            for(int i = 1; i < temp.length; i++) {
                array[i-1] = temp[i];
            }
            
        }else if(index == temp.length -1) {
            for(int i = 0; i < temp.length - 1; i++) {
                array[i] = temp[i];
            }
            
        }else {
            for(int i = 0; i < index; i++) {
                array[i] = temp[i];
            } 
            for(int i = index+1; i < temp.length; i++) {
                array[i - 1] = temp[i];
            }
        }
        
        return array;

    }
    
    public String[] remove(String[] array, String element) {
        return removeByIndex(array, indexOf(array, element));
    }
    
    public boolean contains(String[] array, String element) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(element)) {
                return true;
            }
        }
        
        
        return false;
    }
   
}















