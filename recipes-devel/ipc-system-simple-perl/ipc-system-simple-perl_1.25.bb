DESCRIPTION = "Calling Perl's in-built "system()" function is easy, determining if it was \
successful is *hard*. Let's face it, $? isn't the nicest variable in the \
world to play with, and even if you *do* check it, producing a \
well-formatted error string takes a lot of work."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IPC-System-Simple"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PJ/PJF/IPC-System-Simple-1.25.tar.gz"

SRC_URI[md5sum] = "fb49e674e1d52e8e5646d08507d7fda5"
SRC_URI[sha256sum] = "f1b6aa1dfab886e8e4ea825f46a1cbb26038ef3e727fef5d84444aa8035a4d3b"

S = "${WORKDIR}/IPC-System-Simple-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
