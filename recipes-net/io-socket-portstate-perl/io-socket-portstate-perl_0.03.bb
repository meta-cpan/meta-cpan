DESCRIPTION = "You can use it to check if a port is open or closed for a given host and \
protocol."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Socket-PortState"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DM/DMUEY/IO-Socket-PortState-0.03.tar.gz"

SRC_URI[md5sum] = "ba82446a68380e8bd79ab49a5948d6c1"
SRC_URI[sha256sum] = "9b6272699d2afd6f65aaa118e2613da28a9f3ba7a80c30bd0cfb16619db131bc"

S = "${WORKDIR}/IO-Socket-PortState-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
