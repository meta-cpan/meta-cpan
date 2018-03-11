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

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZUHO/Server-Starter-0.34.tar.gz"

SRC_URI[md5sum] = "c1434469726c42fb6830fbe9d99ff62c"
SRC_URI[sha256sum] = "96a20d4a1f341655bd1b26df5795d57c5d7498d9bcf8ca9d0d6e2ed743608f78"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-sharedfork-perl-native"
DEPENDS += "test-tcp-perl-native"

S = "${WORKDIR}/Server-Starter-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
