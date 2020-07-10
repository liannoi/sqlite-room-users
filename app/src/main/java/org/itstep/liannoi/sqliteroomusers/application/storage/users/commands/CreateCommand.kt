package org.itstep.liannoi.sqliteroomusers.application.storage.users.commands

class CreateCommand(
    val firstName: String,
    val lastName: String
) {
    interface Handler {
        fun onUserCreatedSuccess()

        // TODO: Replace with custom Exception.
        fun onUserCreatedError(exception: String)
    }
}
