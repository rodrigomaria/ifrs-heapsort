/**
 * @License
 * Copyright 2020 Heap Sort Application
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ifrs.vvs;

/**
 * Heap Sort App.
 */
@SuppressWarnings({"PMD", "checkstyle:hideutilityclassconstructor"})
public final class App {
    /**
     * Sorts the array using Heap Sort https://www.geeksforgeeks.org/heap-sort/.
     */
    public static void main(String[] args) {
        @SuppressWarnings("checkstyle:magicnumber")
        int[] arr = {12, 11, 13, 5, 6, 7};

        HeapSort heapsort = new HeapSort();

        System.out.println("Unsorted array is");
        heapsort.printArray(arr);

        // sort by heapsort
        heapsort.sort(arr);

        System.out.println("Sorted array is");
        heapsort.printArray(arr);
    }
}
