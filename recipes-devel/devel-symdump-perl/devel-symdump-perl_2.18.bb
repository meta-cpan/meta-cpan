DESCRIPTION = "This little package serves to access the symbol table of perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Symdump"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AN/ANDK/Devel-Symdump-2.18.tar.gz"

SRC_URI[md5sum] = "3dd7e1c7779a37c31a3eb60c0a97ea9f"
SRC_URI[sha256sum] = "826f81a107f5592a2516766ed43beb47e10cc83edc9ea48090b02a36040776c0"

S = "${WORKDIR}/Devel-Symdump-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
