DESCRIPTION = "This module makes the functionality of the perltidy utility available to \
perl scripts. Any or all of the input parameters may be omitted, in which \
case the @ARGV array will be used to provide input parameters as described \
in the perltidy(1) man page."

SECTION = "libs"
LICENSE = "GPL-2.0-only"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Perl-Tidy"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-20211029.tar.gz"

SRC_URI[md5sum] = "edf2140290fb0d285c881221599bc286"
SRC_URI[sha256sum] = "ec03b1e36a57d094569a30082688f722253401c7cc934ac64d2e3eb4de880eda"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
