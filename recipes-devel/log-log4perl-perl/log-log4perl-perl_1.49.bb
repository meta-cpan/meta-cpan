DESCRIPTION = "Log::Log4perl lets you remote-control and fine-tune the logging behaviour \
of your system from the outside. It implements the widely popular \
(Java-based) Log4j logging package in pure Perl."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Log4perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSCHILLI/Log-Log4perl-1.49.tar.gz"

SRC_URI[md5sum] = "8e96fb5e236c92445947eceb903326ba"
SRC_URI[sha256sum] = "b739187f519146cb6bebcfc427c64b1f4138b35c5f4c96f46a21ed4a43872e16"

S = "${WORKDIR}/Log-Log4perl-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
