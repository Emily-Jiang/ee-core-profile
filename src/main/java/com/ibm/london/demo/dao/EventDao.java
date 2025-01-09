package com.ibm.london.demo.dao;

import java.util.HashMap;

// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2018, 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
// end::copyright[]


import java.util.List;
import java.util.Map;

import com.ibm.london.demo.models.Event;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class EventDao {

    private static Map<Integer, Event> events = new HashMap<>();

    public void createEvent(Event event) {
        events.putIfAbsent(event.getId(), event);
    }

    public Event readEvent(int eventId) {
        return events.get(eventId);
    }

    public void updateEvent(Event event) {
        events.put(event.getId(), event);
    }

    public void deleteEvent(int eventId) {
        events.remove(eventId);
    }

    public List<Event> readAllEvents() {
        return events.values().stream().toList();
    }

    public Event findEvent(int id) {
        return events.get(id);
    }
    
}

