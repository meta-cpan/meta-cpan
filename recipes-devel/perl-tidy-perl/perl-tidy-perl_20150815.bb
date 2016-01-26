DESCRIPTION = "This module makes the functionality of the perltidy utility available \
to perl scripts. Any or all of the input parameters may be omitted, in \
which case the @ARGV array will be used to provide input parameters as \
described in the perltidy(1) man page."

SECTION = "libs"
LICENSE = "GPL-2.0+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Perl-Tidy"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-20150815.tar.gz"

SRC_URI[md5sum] = "2db845ed25151dd86cf45dd7f72a3471"
SRC_URI[sha256sum] = "0a969d9e6c0428fab394aa66b716ca2ca052fe4aa2ef144f7dacc3355c13ebd7"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
