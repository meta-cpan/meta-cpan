DESCRIPTION = "This documentation describes the Template module which is the direct \
Perl interface into the Template Toolkit. It covers the use of the \
module and \
gives a brief summary of configuration options and template directives. \
Please see Template::Manual for the complete reference manual which \
goes \
into much greater depth about the features and use of the Template \
Toolkit. \
The Template::Tutorial is also available as an introductory guide to \
using \
the Template Toolkit."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Template-Toolkit"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AB/ABW/Template-Toolkit-2.25.tar.gz"

SRC_URI[md5sum] = "6be78743caf5fafe8de4a17c2d0c72ff"
SRC_URI[sha256sum] = "f423763b01604dcf27902cc6fdb22a6d1e5d3f2f72044fd9e83123220f781e11"
RDEPENDS_${PV} += "appconfig-perl"

S = "${WORKDIR}/Template-Toolkit-${PV}"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
