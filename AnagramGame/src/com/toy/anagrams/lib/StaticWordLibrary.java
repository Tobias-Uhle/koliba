/*
 * Copyright (c) 2010, Oracle.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  * Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT 
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED 
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */

package com.toy.anagrams.lib;

/**
 * Implementation of the logic for the Anagram Game application.
 * Some comment
 */
final class StaticWordLibrary extends WordLibrary {

    private static final String[] WORD_LIST = {
        "Liste",
        "Nebel",
        "rot",
        "Sarg",
        "Lampe",
        "Mehl",
        "Michael Jackson",
        "Anna",
        "Regal",
        "Tragen",
        "Mehl",
        "Raben",
        "Tapas",
        "Prost",
        "Eichel",
        "Salat",
        "Ferien",
        "Mietshaus",
        "England",
        "Island",
        "Wiki",
        "Salat",
        "abgeerntet",
        "Atheismus",
        "Kater",
        "Kiwi"
    };

    private static final String[] SCRAMBLED_WORD_LIST = {
        "Stiel",
        "Leben",
        "Tor",
        "Gras",
        "Ampel",
        "Lehm",
        "Naja Milchsocke",
        "Anna",
        "Lager",
        "Garten",
        "Helm",
        "Narbe",
        "Pasta",
        "Sport",
        "Leiche",
        "Atlas",
        "Reifen",
        "Atheismus",
        "Geldnan",
        "Adslin",
        "Kiwi",
        "Atlas",
        "Gartenbeet",
        "Mietshaus",
        "Karte",
        "Wiki"
    };
    
    final static WordLibrary DEFAULT = new StaticWordLibrary();

    /**
     * Singleton class.
     */
    private StaticWordLibrary() {
    }

    /**
     * Gets the word at a given index.
     * Comment: 
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     * @param idx index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equalsIgnoreCase(getWord(idx));
    }

}
