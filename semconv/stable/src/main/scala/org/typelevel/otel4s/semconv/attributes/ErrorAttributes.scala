/*
 * Copyright 2023 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.typelevel.otel4s
package semconv
package attributes

// DO NOT EDIT, this is an Auto-generated file from buildscripts/templates/registry/otel4s/attributes/SemanticAttributes.scala.j2
object ErrorAttributes {

  /** Describes a class of error the operation ended with. <p>
    * @note
    *   <p> The `error.type` SHOULD be predictable, and SHOULD have low cardinality. <p> When `error.type` is set to a
    *   type (e.g., an exception type), its canonical class name identifying the type within the artifact SHOULD be
    *   used. <p> Instrumentations SHOULD document the list of errors they report. <p> The cardinality of `error.type`
    *   within one instrumentation library SHOULD be low. Telemetry consumers that aggregate data from multiple
    *   instrumentation libraries and applications should be prepared for `error.type` to have high cardinality at query
    *   time when no additional filters are applied. <p> If the operation has completed successfully, instrumentations
    *   SHOULD NOT set `error.type`. <p> If a specific domain defines its own set of error identifiers (such as HTTP or
    *   gRPC status codes), it's RECOMMENDED to: <p> <ul> <li>Use a domain-specific attribute <li>Set `error.type` to
    *   capture all errors, regardless of whether they are defined within the domain-specific set or not. </ul>
    */
  val ErrorType: AttributeKey[String] =
    AttributeKey("error.type")

  /** Values for [[ErrorType]].
    */
  abstract class ErrorTypeValue(val value: String)
  object ErrorTypeValue {

    /** A fallback error value to be used when the instrumentation doesn't define a custom value.
      */
    case object Other extends ErrorTypeValue("_OTHER")
  }

}