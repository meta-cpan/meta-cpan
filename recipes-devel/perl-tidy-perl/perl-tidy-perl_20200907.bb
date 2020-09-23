DESCRIPTION = "This module makes the functionality of the perltidy utility available to \
perl scripts. Any or all of the input parameters may be omitted, in which \
case the @ARGV array will be used to provide input parameters as described \
in the perltidy(1) man page."

SECTION = "libs"
LICENSE = "GPLv2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Perl-Tidy"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-20200907.tar.gz"

SRC_URI[md5sum] = "4183e5e96524f39d3c89ab67c3d87910"
SRC_URI[sha256sum] = "72c9324a188ecf7c9cd4ed8b7718be993ad77d4d9bc770b284caa17278467c18"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
