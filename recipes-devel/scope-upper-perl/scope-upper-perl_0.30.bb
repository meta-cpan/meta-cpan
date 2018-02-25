DESCRIPTION = "This module lets you defer actions *at run-time* that will take place when \
the control flow returns into an upper scope. Currently, you can:"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scope-Upper"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/V/VP/VPIT/Scope-Upper-0.30.tar.gz"

SRC_URI[md5sum] = "205e93ba8a666a7f7d6fdf9c1b75551a"
SRC_URI[sha256sum] = "7f151582423850d814034404b1e23b5efb281b9dd656b9afe81c761ebb88bbb4"

S = "${WORKDIR}/Scope-Upper-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
