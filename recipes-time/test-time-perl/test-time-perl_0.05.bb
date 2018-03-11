DESCRIPTION = "Test::Time can be used to test modules that deal with time. Once you "use" \
this module, all references to "time" and "sleep" will be internalized. You \
can set custom time by passing time => number after the "use" statement:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Time"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SA/SATOH/Test-Time-0.05.tar.gz"

SRC_URI[md5sum] = "55b6c08cb9adef6411cbb3316670a5c2"
SRC_URI[sha256sum] = "abef8885a811440114bfe067edc32f08500fbfd624902f8c3a81fc224ac4b410"

S = "${WORKDIR}/Test-Time-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
