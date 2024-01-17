/*
 * GUMBOX BLUE CORPORATION.
 * Copyright (C) 2023-present Gumbox Blue, Corporation. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Gumbox Blue Corporation.
 * ("Confidential Information"). You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement you entered
 * into with Gumbox Blue Corporation.
 *
 */
package com.gumbox.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gumbox.cashcard.CashCard;

/**
 * @GetMapping we can apply only on method level
 * @RequestMapping annotation we can apply on class level and as well as on
 *                 method level
 *
 * @author Hammer
 */

@RestController
@RequestMapping("/cashcards")
class CashCardController {

	/*
	 * URL: http://localhost:8000/cashcards/{requestId}/abc?{RequestParam},
	 *
	 * @PathVariable is used to capture values from the URL path.
	 *
	 * @RequestParam is used to capture query parameters or form parameters from the
	 * URL.
	 */
	@GetMapping("/{requestedId}")
	private ResponseEntity<CashCard> findById() {
		CashCard cashCard = new CashCard(1000L, 0.0);
		return ResponseEntity.ok(cashCard);
	}
}
