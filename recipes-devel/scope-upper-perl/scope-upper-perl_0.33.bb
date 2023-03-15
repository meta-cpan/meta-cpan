DESCRIPTION = "This module lets you defer actions *at run-time* that will take place when \
the control flow returns into an upper scope. Currently, you can:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scope-Upper"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/V/VP/VPIT/Scope-Upper-0.33.tar.gz"

SRC_URI[md5sum] = "7429e28c36297aba11d7655edc74385a"
SRC_URI[sha256sum] = "5f33be01ad68fcbec6ef81eeb03b3511a2f5f0752ad513d993a4c13a5fb1a648"

S = "${WORKDIR}/Scope-Upper-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
