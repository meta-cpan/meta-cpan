DESCRIPTION = "This module makes it easy to install subroutines into packages without the \
unsightly mess of "no strict" or typeglobs lying about where just anyone \
can see them."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Install"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Sub-Install-0.928.tar.gz"

SRC_URI[md5sum] = "e1ce4f9cb6b2f6b8778b036c31afa5ab"
SRC_URI[sha256sum] = "61e567a7679588887b7b86d427bc476ea6d77fffe7e0d17d640f89007d98ef0f"

S = "${WORKDIR}/Sub-Install-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
