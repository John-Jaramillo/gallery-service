/*
 *  Copyright 2020 CNM Ingenuity, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package edu.cnm.deepdive.gallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;

/**
 * Serves as the main entry point for the resource server application.
 */
@SpringBootApplication
@EnableHypermediaSupport(type = {HypermediaType.HAL})
public class GalleryApplication {

  /**
   * Main application method launches Spring, passing the command-line arguments to it. These
   * arguments can be used to set (or override) application property values.
   *
   * @param args Command-line arguments.
   */
  public static void main(String[] args) {
    SpringApplication.run(GalleryApplication.class, args);
  }

}
