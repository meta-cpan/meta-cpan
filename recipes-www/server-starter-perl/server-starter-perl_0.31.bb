DESCRIPTION = "It is often a pain to write a server program that supports graceful \
restarts, with no resource leaks. Server::Starter solves the problem by \
splitting the task into two. One is start_server, a script provided as \
a \
part of the module, which works as a superdaemon that binds to zero or \
more \
TCP ports or unix sockets, and repeatedly spawns the server program \
that \
actually handles the necessary tasks (for example, responding to \
incoming \
commenctions). The spawned server programs under Server::Starter call \
accept(2) and handle the requests."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Server-Starter"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZUHO/Server-Starter-0.31.tar.gz"

SRC_URI[md5sum] = "48a6cca38adeb57878d5339891dcfacf"
SRC_URI[sha256sum] = "50013f8ff41e12a29db90bee672ae86c1b5552b105ba9ac3815544ffafd5d1ed"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-sharedfork-perl-native"
DEPENDS += "test-tcp-perl-native"

S = "${WORKDIR}/Server-Starter-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
