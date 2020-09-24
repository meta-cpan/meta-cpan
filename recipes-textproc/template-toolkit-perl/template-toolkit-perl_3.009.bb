DESCRIPTION = "This documentation describes the Template module which is the direct Perl \
interface into the Template Toolkit. It covers the use of the module and \
gives a brief summary of configuration options and template directives. \
Please see Template::Manual for the complete reference manual which goes \
into much greater depth about the features and use of the Template Toolkit. \
The Template::Tutorial is also available as an introductory guide to using \
the Template Toolkit."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Template-Toolkit"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Template-Toolkit-3.009.tar.gz"

SRC_URI[md5sum] = "f1c401067b728337a8a8c0d4ae642af8"
SRC_URI[sha256sum] = "d6ad23bbf637a59b5dfd1ac006460dfcb185982e4852cde77150fbd085f1f5b6"
RDEPENDS_${PN} += "appconfig-perl"
DEPENDS += "cgi-perl-native"
DEPENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/Template-Toolkit-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
