DESCRIPTION = "It is often a pain to write a server program that supports graceful \
restarts, with no resource leaks. Server::Starter solves the problem by \
splitting the task into two. One is start_server, a script provided as a \
part of the module, which works as a superdaemon that binds to zero or more \
TCP ports or unix sockets, and repeatedly spawns the server program that \
actually handles the necessary tasks (for example, responding to incoming \
connections). The spawned server programs under Server::Starter call \
accept(2) and handle the requests."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Server-Starter"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZUHO/Server-Starter-0.35.tar.gz"

SRC_URI[md5sum] = "10cc818382ff22b27d9af37344fbff18"
SRC_URI[sha256sum] = "676dc0d6cff4648538332c63c32fb88ad09ed868213ea9e62e3f19fad41b9c40"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-sharedfork-perl-native"
DEPENDS += "test-tcp-perl-native"

S = "${WORKDIR}/Server-Starter-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
