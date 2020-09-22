DESCRIPTION = "Test::Time can be used to test modules that deal with time. Once you "use" \
this module, all references to "time", "localtime" and "sleep" will be \
internalized. You can set custom time by passing time => number after the \
"use" statement:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Time"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SA/SATOH/Test-Time-0.08.tar.gz"

SRC_URI[md5sum] = "4b4d3696b84ce797301e5c673b923a53"
SRC_URI[sha256sum] = "b8bc3b074bb2247e8588399c1e55d071f049cf6ce1c8b4192c38cf3c24559548"

S = "${WORKDIR}/Test-Time-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
